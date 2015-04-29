package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;


import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

public class AddPassportEvent implements PassportEvent {

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getId()
	 */
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getMessage()
	 */
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#writeMessage()
	 */
	public void writeMessage() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getAothor()
	 */
	public Owner getAothor() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getPassport()
	 */
	public Passport getPassport() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getTime()
	 */
	public LocalDate getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getData()
	 */
	public DateTime getData() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getDataTime()
	 */
	public DateTime getDataTime() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getType()
	 */
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getIdAothor()
	 */
	public int getIdAothor() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent#getIdPassport()
	 */
	public int getIdPassport() {
		// TODO Auto-generated method stub
		return 0;
	}

}
