package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries.SQLServerQueries;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.EventRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.OrganizationRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.PassportRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.rowMappers.UserRowMapper;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.User;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class AdminSpringDAO implements DAO  {
	
	/**
	 * ��������� ����� ������������ ��� ���������� ������� - ���������� ����
	 */
	private static final String ADD_EVENT = "ADDITION";
	
	/**
	 * ��������� ����� ������������ ��� ���������� ������� - �������������e ����
	 */
	private static final String EDIT_EVENT = "EDITION";
	
	/**
	 * ��������� ����� ������������ ��� ���������� ������� - �������� ����
	 */
	private static final String DELETE_EVENT = "DELETION";
	
	/**
	 * ��������� ����� ������������ ��� ���������� ������� - �������� ����
	 */
	private static final String REVIEW_EVENT = "REVIEW";

	/**
	 * ����������� ��-���������
	 */
	public AdminSpringDAO(){
		postConstruct();
	}
	
	/**
	 * ������ ��� ��������� ������ ��������
	 */
	SQLQueries sqlQueries = new SQLServerQueries();
	/**
	 * ������ DataSource
	 */
	SQLServerDataSource ds = null;
	/**
	 * ������ ������ ��� �������������� ���� ������
	 */
	JdbcTemplate jdbcTemplate = null;
	/**
	 * ������, ������������ �������� � ����������� ������ �� ��
	 */
	PassportRowMapper passportRowMapper = new PassportRowMapper();
	/**
	 * ������, ������������ ����������� � ����������� ������ �� ��
	 */
	OrganizationRowMapper organizationRowMapper = new OrganizationRowMapper();
	/**
	 * ������, ������������ ������� � ����������� ������ �� ��
	 */
	EventRowMapper eventRowMapper = new EventRowMapper();
	/**
	 * ������, ������������ ������������ � ����������� ������ �� ��
	 */
	UserRowMapper userRowMapper = new UserRowMapper();
	
	/**
	 * ����������� DataSource � ���� ������ � �������� jdbcTemplate
	 */
	public void postConstruct(){
		ds = new SQLServerDataSource();
		ds.setPortNumber(1433);
		ds.setHostNameInCertificate("localhost");
		ds.setDatabaseName("passport_agricultural");
		ds.setUser("adminAgricultural");
		ds.setPassword("admin123");
		
		jdbcTemplate = new JdbcTemplate(ds);
	}
	
	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#createOwner(java.util.Map)
	 */
	public void createOwner(Owner owner) {
		Object [] values = new Object[]{owner.getName(), owner.getINN(), owner.getAddres()};
		String sqlQuery = sqlQueries.createOwner();
		jdbcTemplate.update(sqlQuery, values);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#deleteOwner(java.util.Map)
	 */
	public void deleteOwner(int idOwner) {
		Object [] values = new Object[]{idOwner};
		jdbcTemplate.update(sqlQueries.deleteOwner(), values);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#editOwner(java.util.Map)
	 */
	public void editOwner(Owner owner) {
		Object [] values = new Object[]{owner.getName(), owner.getINN(), owner.getAddres(), owner.getId()};
		String sqlQuery = sqlQueries.editOwner();
		jdbcTemplate.update(sqlQuery, values);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#reviewOwner(java.util.Map)
	 */
	public Owner reviewOwner(int id) {
		Object [] values = new Object[]{id};
		List<Organization> resultSet = jdbcTemplate.query(sqlQueries.reviewOwner(), values, organizationRowMapper);
		return  resultSet.get(0);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#createOwner(java.util.Map)
	 */
	public void createPassport(Passport passport) {
		Object [] values = new Object[]{passport.getIdOwner(), passport.getRegion(), passport.getCadastrNumber(), 
										passport.getArea(), passport.getType(), passport.getComment()};
		jdbcTemplate.update(sqlQueries.createPassport(), values);
		
		//������� ������ ��� ����������� ������� �� ������������� Id ��������� ������ �����������
		passport.setID(getPassportwithMaxId(passport.getIdOwner()));
		
		//������������ ������� ���������� ����
		addPassportEvent(passport, ADD_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#deleteOwner(java.util.Map)
	 */
	public void deletePassport(int id) {
		Object [] values = new Object[]{id};
		Passport passport = reviewPassport(id);
		jdbcTemplate.update(sqlQueries.deletePassport(), values);
		
		//������������ ������� �������� ����
		addPassportEvent(passport, DELETE_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#editOwner(java.util.Map)
	 */
	public void editPassport(Passport passport) {
		Object [] values = new Object[]{passport.getIdOwner(), passport.getRegion(), passport.getCadastrNumber(), passport.getArea(), passport.getType(), passport.getComment(), passport.getID()};
		jdbcTemplate.update(sqlQueries.editPassport(), values);

		//������������ ������� �������������� ����
		addPassportEvent(passport, EDIT_EVENT);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#reviewOwner(java.util.Map)
	 */
	public Passport reviewPassport(int id) {
		Object[] values = new Object[] {id};
		List<Passport> resultSet = jdbcTemplate.query(sqlQueries.reviewPassport(), values , passportRowMapper);

		//������������ ������� ��������� ����
		addPassportEvent(resultSet.get(0), REVIEW_EVENT);
		return resultSet.get(0);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#reviewAllPassports()
	 */
	public List<Passport> reviewAllPassports() {
		return jdbcTemplate.query(sqlQueries.reviewAllPassports(), passportRowMapper);
	}

	/**
	 * 
	 * @see dataTier.accessToDataServices.DAO#findPassports(java.util.Map)
	 */
	public List<Passport> findPassports(Map<String, String> info) {
		return jdbcTemplate.query(sqlQueries.findPassports(info), passportRowMapper);
	}
	
	/**
	 * �������� ������ ������� � ���� ������
	 */
	private void addPassportEvent(Passport passport, String TypeEvent) {
		
		PassportEvent event = new PassportEvent(passport, TypeEvent, this);
		Object[] values = new Object[] {event.getIdPassport(), event.getIdAuthor(), event.getMessage(), event.getType()};
		String sqlQuery = sqlQueries.createPassportEvent();
		jdbcTemplate.update(sqlQuery, values);
	}
	
	/**
	 * �������� ������ ������� �� ��
	 * @param idEvent - id ���������� �������
	 */
	public void deletePassportEvent(int idEvent){
		jdbcTemplate.update(sqlQueries.deletePassportEvent(), new Object[]{idEvent});
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO#reviewAllPassportEvent()
	 */
	public List<PassportEvent> reviewAllPassportEvent(){
		List<PassportEvent> events = new ArrayList<PassportEvent>();
		events = jdbcTemplate.query(sqlQueries.reviewAllPassportEvent(), eventRowMapper);
		return events;
	}
	
	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO#reviewAllOwnerEvents(int)
	 */
	public List<PassportEvent> reviewAllOwnerEvents(int idOwner) {
		List<PassportEvent> events = new ArrayList<PassportEvent>();
		events = jdbcTemplate.query(sqlQueries.reviwAllOwnerPassportEvent(), new Object[]{idOwner}, eventRowMapper);
		return events;
	}

	/**
	 * �������� id �������� �����������, ������� �������� ������������ ����� ���� id ��������� ���� �����������
	 * @param idOwner - id ���������
	 * @return - id
	 */
	private int getPassportwithMaxId(int idOwner) {
		return jdbcTemplate.queryForInt(sqlQueries.getMAXidPassportByOwner(), new Object[]{idOwner});
	}

	/*
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO#authorization(java.lang.String, java.lang.String)
	 */
	@Override
	public User authorization(String login, String password) {
		Object [] values = new Object[]{login, password};
		List<User> user = jdbcTemplate.query(sqlQueries.registration(), values, userRowMapper);
		if(user.isEmpty()){
			return null;
		}else{
			return user.get(0);
		}
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO#registration(java.lang.String, java.lang.String)
	 */
	@Override
	public User registration(String login, String password, int idOrganization) {
		Object [] values = new Object[]{login, password, idOrganization};
		jdbcTemplate.update(sqlQueries.registration(), values);
		return authorization(login, password);
	}

}
