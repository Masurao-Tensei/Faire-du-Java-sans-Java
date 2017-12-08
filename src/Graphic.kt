import javafx.animation.Animation
import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.CheckBox
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.Text
import javafx.stage.Stage
import javafx.util.Duration
import java.util.*
import java.util.logging.Handler
import kotlin.concurrent.timerTask


class Graphic()
{
     fun initialisationFenetre(primaryStage : Stage)
    {
        //creation de la troupe
       var group:Group = Group()

        //création de la scene
        var scene : Scene = Scene(group,700.0, 700.0, Color.DARKGRAY)

        primaryStage.scene = scene

        //création image
        var imageQuestion : ImageView = ImageView()

        //création checkbox
        var cba: CheckBox
        var cbb: CheckBox
        var cbc: CheckBox
        var cbd: CheckBox

        var valideButton : Button = Button("Valider")



        var reponse:Array<Char>
        var soluce:String = "BD"

        var question : String = """
            |L'adversaire rentre dans le tunnel au début de waluigi pinball
            |[A] Je lance ma carapace rouge  [B] J'attend d'être sorti du tunnel
            |Une carapace bleue sera efficace dans le tunnel
            |[C] Oui                         [D] Non, duh""".trimMargin()

        var text:Text = Text(50.0, 50.0, question)
        text.font = Font(20.0)
        valideButton.scaleX = 2.0
        valideButton.scaleY = 2.0
        valideButton.layoutX = 600.0
        valideButton.layoutY = 650.0

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

        group.children.add(text)
        group.children.add(cba)
        group.children.add(cbb)
        group.children.add(cbc)
        group.children.add(cbd)
        group.children.add(valideButton)

        primaryStage.show()

        valideButton.setOnMouseClicked { event ->
            reponse = arrayOf(' ')
            if(cba.isSelected)
                reponse = reponse.plus('A')
            if(cbb.isSelected)
                reponse = reponse.plus('B')
            if(cbc.isSelected)
                reponse = reponse.plus('C')
            if(cbd.isSelected)
                reponse = reponse.plus('D')

            validationReponses(reponse, soluce)

        }


        affichageEtReponseQuestion(null)

    }
    fun affichageEtReponseQuestion(question: Image?)
    {

    }


}