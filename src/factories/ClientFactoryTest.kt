package factories

import clients.BarClient
import clients.FooClient
import factories.ClientFactory.create
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ClientFactoryTest {

    @Test
    fun testBarClientCreate() {
        val barClient = create<BarClient>()

        Assertions.assertNotNull(barClient)
    }

    @Test
    fun testFooClientCreate() {
        val fooClient = create<FooClient>()

        Assertions.assertNotNull(fooClient)
    }
}