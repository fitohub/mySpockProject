package testPackage

import spock.lang.*

@Issue(["Interview"])
// Use case - Create an active equipment of terminal type
// with serial number "TEST001" and externalId "test_id_001"

// Needed information for this exercise : 

// Class name is "Equipment"
// Mandatory fields are "externalId", "serialNumber", "type", "status", "lastModifiedDate"
// "OffsetDateTime.now()" returns the current date
// Function to create the equipment is "equipmentFeature.createOrUpdate"

class Equipment extends Specification {
	
	def obj = new equipmentFeature()
	
	def "Use case - Create a TERMINAL type and ACTIVE status equipment"() {
		given:
		obj
		
		when:
		def rc = obj.createOrUpdate("test_id_001", "TEST001", "TERMINAL", "ACTIVE")
		
		then:
		obj.map.each { key, value ->
			println "$key: $value"
		}
	}

}
