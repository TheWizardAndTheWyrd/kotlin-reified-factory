package factories

import clients.BarClient
import clients.BaseClient
import clients.FooClient

object ClientFactory {
    inline fun <reified T : BaseClient> create() : Any? {

        return when (T::class) {
            BarClient::class -> {
                createMessage<T>()
                return Any()
            }

            FooClient::class -> {
                createMessage<T>()
                return Any()
            }

            else -> null
        }
    }

    inline fun <reified T : BaseClient> createMessage() {
        System.out.print("Creating ${T::class}")
    }
}