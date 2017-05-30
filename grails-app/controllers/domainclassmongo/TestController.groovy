package domainclassmongo

class TestController {

    def index() {
		Cluster cluster = new Cluster(name: 'Dallas', slug: 'dal05')
		cluster.insert(failOnError: true)
	}
	
}
