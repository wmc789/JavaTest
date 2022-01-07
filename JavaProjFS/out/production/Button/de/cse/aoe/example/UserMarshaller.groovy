package de.cse.aoe.example

import de.cse.aoe.example.User
import grails.converters.JSON

class UserMarshaller {

	public void register() {
		JSON.registerObjectMarshaller(User) { User user ->
			def map = [:]

			map['id'] = user.id
			map['username'] = user.username
			map['password'] = user.password
			map['email'] = user.email
			map['name'] = user.name
			map['accountExpired'] = user.accountExpired
			map['accountLocked'] = user.accountLocked
			map['passwordExpired'] = user.passwordExpired
			map['enabled'] = user.enabled
			
			return map
		}
	}
}
