package com.oumar.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //initialize variables
    private lateinit var confirmButton: Button
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    private lateinit var clearButton: Button



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Declaring the variables
        editText = findViewById(R.id.editText)
        clearButton = findViewById(R.id.clearButton)
        confirmButton = findViewById(R.id.confirmButton)
        textView = findViewById(R.id.textView)


        val animationDrawable =

        //Make the button clickable
        confirmButton.setOnClickListener {
            val  age = editText.text.toString().toIntOrNull()

            if( age != null && age in 20..100 ) {

                val famous = when (age) {

                    //-
                    25 -> "Tupac Shakur : Influential American rapper, actor, and activist of the 1990s known for his socially conscious lyrics and cultural impact. Assassinated in 1996."

                    27 -> "Jimi Hendrix : Legendary rock guitarist, widely regarded as one of the greatest of all time. Career marked by electrifying performances. Died in 1970."

                    28 -> "Heath Ledger : Talented Australian actor, known for roles in \"Brokeback Mountain\" and \"The Dark Knight\". Posthumously won an Oscar for his portrayal of the Joker. Died in 2008."

                    32 -> "Bruce Lee : Chinese-American martial artist, actor, and filmmaker. Influential figure in martial arts and action cinema. Died in 1973."

                    34 -> "Charlie Parker : American jazz saxophonist and composer, nicknamed \"Bird\". Pioneer of bebop in the 1940s. Died in 1955."

                    36 -> "Marilyn Monroe : American actress, singer, and fashion icon. Known for her charisma and beauty. Died in 1962."

                    39 -> "Martin Luther King Jr. : Iconic American civil rights leader known for his role in the advancement of civil rights using nonviolent civil disobedience. Assassinated in 1968."

                    40 -> "John Lennon : English musician, singer, and songwriter, best known as a co-founder of the Beatles. Iconic figure in music and activism. Assassinated in 1980."

                    42 -> "Elvis Presley : American singer, musician, and actor, often referred to as the \"King of Rock and Roll\". Cultural icon of the 20th century. Died in 1977."

                    45 -> "Freddie Mercury : British singer, songwriter, and lead vocalist of the rock band Queen. Known for his powerful voice and flamboyant stage presence. Died in 1991."

                    46 -> "John F. Kennedy : 35th President of the United States, known for his leadership during the Cuban Missile Crisis and his push for civil rights. Assassinated in 1963."

                    48 -> "Whitney Houston : Iconic American singer and actress, one of the best-selling music artists of all time. Known for her powerful voice and hits such as \"I Will Always Love You\". Died in 2012."

                    50 -> "Michael Jackson : Legendary American singer, songwriter, and dancer, known as the \"King of Pop\". One of the most significant cultural figures of the 20th century. Died in 2009."

                    53 -> "Robin Hood : Legendary outlaw and folk hero in English folklore, known for \"robbing from the rich and giving to the poor\". Depicted in numerous works of literature, film, and television."

                    56 -> "Steve Jobs : Co-founder of Apple Inc., known for his role in revolutionizing personal computing, smartphones, and digital entertainment. Died in 2011."

                    63 -> "Robin Williams : Iconic American actor and comedian, known for his improvisational skills and memorable roles in films such as \"Good Will Hunting\" and \"Mrs. Doubtfire\". Died in 2014."

                    76 -> "Albert Einstein : German-born theoretical physicist, best known for developing the theory of relativity and the equation E=mc². One of the most influential scientists in history. Died in 1955."

                    80 -> "Marlon Brando : Iconic American actor, known for his method acting and roles in films such as \"The Godfather\" and \"A Streetcar Named Desire\". Died in 2004."

                    84 -> "Greta Garbo : Legendary Swedish actress, known for her captivating performances in silent films and talkies. Retired from acting at a young age and became a recluse. Died in 1990."

                    88 -> "Charlie Chaplin : Iconic British actor, comedian, and filmmaker, known for his silent film characters such as \"The Tramp\". Pioneered the art of cinema. Died in 1977."

                    95 -> "Nelson Mandela : South African anti-apartheid revolutionary and political leader, who served as President of South Africa from 1994 to 1999. Known for his advocacy for peace, democracy, and human rights. Died in 2013."

                    else -> null
                }

                val message = if (famous != null) "Your current age corresponds to $famous"
                else "No Celebrity found with the entered age."
                textView.text = message
            }
            else {
                textView.text = "Invalid input. Please enter a valid age between 20 and 100"
            }

            clearButton.setOnClickListener {
                textView.text = " Insert your age "
                editText.text.clear()

            }
        }
    }
}