import javafx.application.Application
import javafx.stage.Stage

fun main(args: Array<String>) {
    println("Hello, world!")
    Application.launch(Main::class.java, *args)
}

class Main : Application()
{
    override fun start(primaryStage: Stage)
    {
        var g = Graphic()
        g.initialisationFenetre(primaryStage)
    }
}