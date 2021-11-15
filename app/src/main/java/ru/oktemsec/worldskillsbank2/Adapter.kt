package ru.oktemsec.worldskillsbank2

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val banks: List<Bank>): RecyclerView.Adapter<Adapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var addressTV: TextView? = null
        var bankomatTV: TextView? = null
        var isWorkingTV: TextView? = null
        var timeTV: TextView? = null

        init {
            addressTV = itemView.findViewById(R.id.addressTV)
            bankomatTV = itemView.findViewById(R.id.bankomatTV)
            isWorkingTV = itemView.findViewById(R.id.isWorkingTV)
            timeTV = itemView.findViewById(R.id.timeTV)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.addressTV?.text = banks[position].address
        holder.bankomatTV?.text = banks[position].type
        holder.timeTV?.text = "Часы работы: ${banks[position].startTime}:00 - ${banks[position].finishTime}:00"

        if (banks[position].isWorking) {
            holder.isWorkingTV?.setTextColor(Color.parseColor("#03DAC6"))
            holder.isWorkingTV?.text = "Работает"
        }
        else {
            holder.isWorkingTV?.setTextColor(Color.RED)
            holder.isWorkingTV?.text = "Не работает"
        }
    }

    override fun getItemCount() = banks.size
}