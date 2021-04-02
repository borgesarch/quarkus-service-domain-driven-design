package core.application.core.users

import core.domain.core.User

interface IUserService {
    fun findAll() : List<User>?
}