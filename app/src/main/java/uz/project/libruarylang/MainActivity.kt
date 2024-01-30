package uz.project.libruarylang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.project.mytoasuz.MyToastUz

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myToastUz = MyToastUz()

        myToastUz.myToast(this)
    }
}