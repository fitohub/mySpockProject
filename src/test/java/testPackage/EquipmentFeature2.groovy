package testPackage

import java.time.OffsetDateTime
import java.util.ArrayList

import groovy.sql.DataSet

class EquipmentFeature2 {
	
	//def equipments = ["externalId":"", "serialNumber":"", "type""", "status", "lastModifiedDate"]
/*	def equipments = [
		'externalId' : '',
		'serialNumber' : '',
		'type' : '',
		'status' : '',
		'lastModifiedDate' : ''
		]
*/
	
	//def equipArray = new String[1][5]
	def map = [:]
	def rc = ""
/*	List equipmentList = [][]
	def externalId
	def serialNumber 
	def type
	def status 
	def lastModifiedDate = OffsetDateTime.now()
*/	 

	def createOrUpdate(externalId, serialNumber, type, status) {
		if (map.containsValue('test_id_001')) {
			map.lastModifiedDate = OffsetDateTime.now()
			rc = "Equipment updated."
		} else {
			map.externalId = externalId
			map.serialNumber = serialNumber
			map.type = type
			map.status = status
			map.lastModifiedDate = OffsetDateTime.now()
			rc = "Equipment created."
		}

/*				Boolean rc = false
		
		
		for (int i=0; i<equipArray.size(); i++) {
			if (equipArray[i][0] == externalId) {
				rc = true
				break
			}
		}
		
		if (rc) {
			equipArray[i][3] = status
			equipArray[i][4] = OffsetDateTime.now()
		} else {
			equipArray[i][0] = externalId
			equipArray[i][1] = serialNumber
			equipArray[i][2] = type
			equipArray[i][3] = status
			equipArray[i][4] = OffsetDateTime.now()
		}

		println $"externalId: " + equipArray[i][0]  
		println "serialNumber: " + equipArray[i][1]
		println "type: " + equipArray[i][2]
		println "status: " + equipArray[i][3]
		println "lastModifiedDate: " + equipArray[i][4]
		
		*/
		map.each { key, value ->
			println "$key: $value"
		}

		return rc
	}
}

