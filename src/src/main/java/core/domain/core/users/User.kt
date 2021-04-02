package core.domain.core.users

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "users")
class User  {
    @Id val id: UUID = UUID.randomUUID();
    @Column(name = "name") val name: String = ""
    @Column(name = "email") val email: String = ""
    @Column(name = "password") val password: String = ""
}