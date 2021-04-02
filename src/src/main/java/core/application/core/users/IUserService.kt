package core.application.core.users

import core.domain.core.users.User

interface IUserService {
    fun findAll() : List<User>?
    fun persist(user : User)
    fun update(user : User)
}