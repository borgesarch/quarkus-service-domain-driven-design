package core.infrastructure.repositories.users

import core.domain.core.IUserRepository
import core.domain.core.users.User
import javax.inject.Singleton

@Singleton
class UserRepository  : IUserRepository {
    override fun all(): List<User> {
        return this.findAll().list()
    }
}