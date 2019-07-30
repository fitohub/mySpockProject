package testPackage

import java.time.OffsetDateTime

class equipmentFeature {
	
	def map = [:]

	def createOrUpdate(externalId, serialNumber, type, status) {
		map.externalId = externalId
		map.serialNumber = serialNumber
		map.type = type
		map.status = status
		map.lastModifiedDate = OffsetDateTime.now()
	}
}
