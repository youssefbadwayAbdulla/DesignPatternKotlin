package design_pattern.bulider

fun main() {
    BuilderLaptop.Builder("i7")
        .setRam("32GB")
        .setBattery("100%")
        .create()
}

class BuilderLaptop(builder: Builder) {
    private val processor: String = builder.processor
    private val ram: String = builder.ram
    private val battery: String = builder.battery
    private val screenSize: String = builder.screenSize

    class Builder(// this is necessary
        val processor: String
    ) {

        // optional features
        var ram: String = "2GB"
        var battery: String = "5000MAH"
        var screenSize: String = "15inch"

        fun setRam(ram: String): Builder {
            this.ram = ram
            return this
        }

        fun setBattery(battery: String): Builder {
            this.battery = battery
            return this
        }

        fun setScreenSize(screenSize: String): Builder {
            this.screenSize = screenSize
            return this
        }

        fun create(): BuilderLaptop {
            return BuilderLaptop(this)
        }


    }


}