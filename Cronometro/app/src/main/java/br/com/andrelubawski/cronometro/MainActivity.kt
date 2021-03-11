package br.com.andrelubawski.cronometro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import br.com.andrelubawski.cronometro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var running = false
    var pause: Long = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iniciar.setOnClickListener{
            IniciarCronometro()
        }
        binding.pausar.setOnClickListener {
            pararCronometro()
        }
        binding.zerar.setOnClickListener {
            zerarCronometro()
        }
    }

    private fun IniciarCronometro(){
        if (!running){
            binding.cronometro.base = SystemClock.elapsedRealtime() - pause
            binding.cronometro.start()
            running = true
        }
    }
    private fun pararCronometro(){
        if(running){
            binding.cronometro.stop()
            pause = SystemClock.elapsedRealtime() - binding.cronometro.base
            running = false
        }
    }
    private fun zerarCronometro(){
        binding.cronometro.base = SystemClock.elapsedRealtime()
        pause = 0
    }
}