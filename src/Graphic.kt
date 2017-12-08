import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.CheckBox
import javafx.scene.paint.Color
import javafx.stage.Stage
import javax.swing.text.html.ImageView
import kotlin.reflect.jvm.internal.impl.util.Check

class Graphic()
{
     fun initialisationFenetre(primaryStage : Stage)
    {
        //creation de la troupe
       var group:Group = Group()

        //création de la scene
        var scene : Scene = Scene(group,700.0, 700.0, Color.CHARTREUSE)


        //création image
        var imageQuestion : ImageView = ImageView(null)

        //création checkbox
        var cba: CheckBox = CheckBox()
        var cbb: CheckBox = CheckBox()
        var cbc: CheckBox = CheckBox()
        var cbd: CheckBox = CheckBox()


        cba = CheckBox("A")
        cba.layoutX = 100.0
        cba.layoutY = 500.0
        cba.scaleX = 5.0
        cba.scaleY = 5.0

        cbb = CheckBox("B")
        cbb.layoutX = 250.0
        cbb.layoutY = 500.0
        cbb.scaleX = 5.0
        cbb.scaleY = 5.0

        cbc = CheckBox("C")
        cbc.layoutX = 400.0
        cbc.layoutY = 500.0
        cbc.scaleX = 5.0
        cbc.scaleY = 5.0

        cbd = CheckBox("D")
        cbd.layoutX = 550.0
        cbd.layoutY = 500.0
        cbd.scaleX = 5.0
        cbd.scaleY = 5.0

        group.children.add(cba)
        group.children.add(cbb)
        group.children.add(cbc)
        group.children.add(cbd)

        var listeBoutonQuestion = ArrayList<Button>()

        primaryStage.scene = scene
        primaryStage.show()
    }
}