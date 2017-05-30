grails {
	mongodb {
		databaseName = 'domainclass'
		host = 'localhost'   // localhost | 192.268.82.54
		port = 27017
		options {
			sslEnabled = false
			sslInvalidHostNameAllowed = false
		}
	}
}
