package ru.oktemsec.worldskillsbank2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BanksList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banks_list)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(
            listOf(
                Bank("с. Чапаево, ул. Николаева 1", "Отделение", true, 8, 20),
                Bank("Якутск, ул. Вавилова, д.7", "Банкомат", false, 9, 20),
                Bank("Новосибирск, ул. Вавилова, д.7", "Банкомат", true, 8, 18),
                Bank("Иркутск, ул. Вавилова, д.7", "Банкомат", false, 10, 18),
                Bank("Владивосток, ул. Вавилова, д.7", "Банкомат", true, 9, 19),
                Bank("Москва, ул. Вавилова, д.7", "Банкомат", true, 9, 18),
                Bank("Москва, ул. Вавилова, д.7", "Банкомат", false, 9, 18),
                Bank("Москва, ул. Вавилова, д.7", "Банкомат", true, 9, 18),
                Bank("Москва, ул. Вавилова, д.7", "Банкомат", true, 9, 18),
                Bank("Москва, ул. Вавилова, д.7", "Банкомат", true, 9, 18),
                Bank("Москва, ул. Вавилова, д.7", "Банкомат", true, 9, 18),
                Bank("Москва, ул. Вавилова, д.7", "Банкомат", true, 9, 18),
                Bank("Москва, ул. Вавилова, д.7", "Банкомат", true, 9, 18)
            )
        )
    }
}