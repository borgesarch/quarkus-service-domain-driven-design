package core.domain.core

import core.domain.core.users.User
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository

interface IUserRepository : PanacheRepository<User> {
    fun all() : List<User>
}