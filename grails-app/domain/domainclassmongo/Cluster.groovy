package domainclassmongo

class Cluster {

	String name
	String slug

	static constraints = {
		name        blank: false, unique: true
		slug        blank: false, unique: true, validator: { return it == it.toLowerCase().replaceAll(/[^\w-]/, '') }
	}

	static mapping = {
		collection 'Cluster'
		id name: 'slug', generator:'assigned'
	}
	
}
