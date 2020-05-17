package edu.psmw.projekt

import android.content.Context
import android.media.Image
import android.os.Bundle
import android.os.StrictMode
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.util.*


class MainActivity : AppCompatActivity() {

    fun onClickTemp(word: Words, kat: String ): String
    {
        val rand_word = word.get_rand_word(this, "slowka/"+kat+".txt")
        label1.text = rand_word
        return rand_word
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StrictMode.allowThreadDiskReads()
        setContentView(R.layout.activity_main)
        var path = "/obrazki/"
        val word = Words() //instancja
        val button_Ubr = btnUbrania
        button_Ubr.setOnClickListener {
            val kat = "ubrania"
            val good_word = onClickTemp(word, kat)
            val image = ImageReader()
            path += kat + "/"
            val wrong_images = Array<String>(3){"it =$it"}
            for (i in 0..2) {
                wrong_images[i] = image.RandImage(good_word, word.readFile(this,"slowka/"+kat+".txt"))
            }
            textView1.text = good_word
            textView2.text = wrong_images[0]
            textView3.text = wrong_images[1]
            textView4.text = wrong_images[2]
            val wrong_image1 = wrong_images[0]
            val wrong_image2 = wrong_images[1]
            val wrong_image3 = wrong_images[2]
            val imageResource = resources.getIdentifier("@drawable/$good_word", null, this.packageName)
            val ximageResource = resources.getIdentifier("@drawable/$wrong_image1", null, this.packageName)
            val yimageResource = resources.getIdentifier("@drawable/$wrong_image2", null, this.packageName)
            val zimageResource = resources.getIdentifier("@drawable/$wrong_image3", null, this.packageName)
            imageView.setImageResource(imageResource)
            imageView2.setImageResource(ximageResource)
            imageView3.setImageResource(yimageResource)
            imageView4.setImageResource(zimageResource)
        }
        val button_dom = btn_dom
        button_dom.setOnClickListener {
            val kat = "dom"
            val good_word = onClickTemp(word, kat)
            val image = ImageReader()
            path += kat + "/"
            val wrong_images = Array<String>(3){"it =$it"}
            for (i in 0..2) {
                wrong_images[i] = image.RandImage(good_word, word.readFile(this,"slowka/"+kat+".txt"))
            }
            textView1.text = good_word
            textView2.text = wrong_images[0]
            textView3.text = wrong_images[1]
            textView4.text = wrong_images[2]
            val wrong_image1 = wrong_images[0]
            val wrong_image2 = wrong_images[1]
            val wrong_image3 = wrong_images[2]
            val imageResource = resources.getIdentifier("@drawable/$good_word", null, this.packageName)
            val ximageResource = resources.getIdentifier("@drawable/$wrong_image1", null, this.packageName)
            val yimageResource = resources.getIdentifier("@drawable/$wrong_image2", null, this.packageName)
            val zimageResource = resources.getIdentifier("@drawable/$wrong_image3", null, this.packageName)
            imageView.setImageResource(imageResource)
            imageView2.setImageResource(ximageResource)
            imageView3.setImageResource(yimageResource)
            imageView4.setImageResource(zimageResource)
        }
        val button_jedzenie = btn_jedzenie
        button_jedzenie.setOnClickListener {
            val kat = "jedzenie"
            val good_word = onClickTemp(word, kat)
            val image = ImageReader()
            path += kat + "/"
            val wrong_images = Array<String>(3){"it =$it"}
            for (i in 0..2) {
                wrong_images[i] = image.RandImage(good_word, word.readFile(this,"slowka/"+kat+".txt"))
            }
            textView1.text = good_word
            textView2.text = wrong_images[0]
            textView3.text = wrong_images[1]
            textView4.text = wrong_images[2]
            val wrong_image1 = wrong_images[0]
            val wrong_image2 = wrong_images[1]
            val wrong_image3 = wrong_images[2]
            val imageResource = resources.getIdentifier("@drawable/$good_word", null, this.packageName)
            val ximageResource = resources.getIdentifier("@drawable/$wrong_image1", null, this.packageName)
            val yimageResource = resources.getIdentifier("@drawable/$wrong_image2", null, this.packageName)
            val zimageResource = resources.getIdentifier("@drawable/$wrong_image3", null, this.packageName)
            imageView.setImageResource(imageResource)
            imageView2.setImageResource(ximageResource)
            imageView3.setImageResource(yimageResource)
            imageView4.setImageResource(zimageResource)
        }
        val button_szkola = btn_szkola
        button_szkola.setOnClickListener {
            val kat = "szkola"
            val good_word = onClickTemp(word, kat)
            val image = ImageReader()
            path += kat + "/"
            val wrong_images = Array<String>(3){"it =$it"}
            for (i in 0..2) {
                wrong_images[i] = image.RandImage(good_word, word.readFile(this,"slowka/"+kat+".txt"))
            }
            textView1.text = good_word
            textView2.text = wrong_images[0]
            textView3.text = wrong_images[1]
            textView4.text = wrong_images[2]
            val wrong_image1 = wrong_images[0]
            val wrong_image2 = wrong_images[1]
            val wrong_image3 = wrong_images[2]
            val imageResource = resources.getIdentifier("@drawable/$good_word", null, this.packageName)
            val ximageResource = resources.getIdentifier("@drawable/$wrong_image1", null, this.packageName)
            val yimageResource = resources.getIdentifier("@drawable/$wrong_image2", null, this.packageName)
            val zimageResource = resources.getIdentifier("@drawable/$wrong_image3", null, this.packageName)
            imageView.setImageResource(imageResource)
            imageView2.setImageResource(ximageResource)
            imageView3.setImageResource(yimageResource)
            imageView4.setImageResource(zimageResource)
        }
        val button_zwierzeta = btn_Zwierzeta
        button_zwierzeta.setOnClickListener {
            val kat = "Zwierzeta"
            val good_word = onClickTemp(word, kat)
            val image = ImageReader()
            path += kat + "/"
            val wrong_images = Array<String>(3){"it =$it"}
            for (i in 0..2) {
                wrong_images[i] = image.RandImage(good_word, word.readFile(this,"slowka/"+kat+".txt"))
            }
            textView1.text = good_word
            textView2.text = wrong_images[0]
            textView3.text = wrong_images[1]
            textView4.text = wrong_images[2]
            val wrong_image1 = wrong_images[0]
            val wrong_image2 = wrong_images[1]
            val wrong_image3 = wrong_images[2]
            val imageResource = resources.getIdentifier("@drawable/$good_word", null, this.packageName)
            val ximageResource = resources.getIdentifier("@drawable/$wrong_image1", null, this.packageName)
            val yimageResource = resources.getIdentifier("@drawable/$wrong_image2", null, this.packageName)
            val zimageResource = resources.getIdentifier("@drawable/$wrong_image3", null, this.packageName)
            imageView.setImageResource(imageResource)
            imageView2.setImageResource(ximageResource)
            imageView3.setImageResource(yimageResource)
            imageView4.setImageResource(zimageResource)
        }

    }

}


