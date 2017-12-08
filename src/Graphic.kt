import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.CheckBox
import javafx.scene.image.ImageView
import javafx.scene.paint.Color
import javafx.stage.Stage
import javafx.util.Duration
import java.util.logging.Handler


class Graphic()
{
     fun initialisationFenetre(primaryStage : Stage)
    {
        //creation de la troupe
       var group:Group = Group()

        //création de la scene
        var scene : Scene = Scene(group,700.0, 700.0, Color.CHARTREUSE)

        primaryStage.scene = scene

        //création image
        var imageQuestion : ImageView = ImageView()

        //création checkbox
        var cba: CheckBox = CheckBox()
        var cbb: CheckBox = CheckBox()
        var cbc: CheckBox = CheckBox()
        var cbd: CheckBox = CheckBox()

        cba = CheckBox("A")
        cba.layoutX = 100.0
        cba.layoutY = 650.0
        cba.scaleX = 4.0
        cba.scaleY = 4.0

        cbb = CheckBox("B")
        cbb.layoutX = 250.0
        cbb.layoutY = 650.0
        cbb.scaleX = 4.0
        cbb.scaleY = 4.0

        cbc = CheckBox("C")
        cbc.layoutX = 400.0
        cbc.layoutY = 650.0
        cbc.scaleX = 4.0
        cbc.scaleY = 4.0

        cbd = CheckBox("D")
        cbd.layoutX = 550.0
        cbd.layoutY = 650.0
        cbd.scaleX = 4.0
        cbd.scaleY = 4.0


        group.children.add(cba)
        group.children.add(cbb)
        group.children.add(cbc)
        group.children.add(cbd)

        cba.isVisible = false
        cbb.isVisible = false
        cbc.isVisible = false
        cbd.isVisible = false


        primaryStage.show()

    }
    fun affichageEtReponseQuestion(primaryStage: Stage) : Array<Char>
    {
        var reponse : Array<Char>
        reponse = arrayOf(' ')
        var attente : Int = 0
        val timeline = Timeline(KeyFrame(Duration.seconds(15.0), object : EventHandler<ActionEvent>
        {
            override fun handle(event: ActionEvent?)
            {
                attente++
            }
        }))


        timeline.cycleCount = 1
        timeline.play()

        while (attente < 15);

            for(c in reponse)
                print(c + " ")
        return reponse
    }


}