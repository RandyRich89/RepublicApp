package com.richardson.example.republicapp.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.richardson.example.republicapp.R
import com.richardson.example.republicapp.request.items.DriverItem
import com.richardson.example.republicapp.request.items.ResultItem
import com.richardson.example.republicapp.request.items.RouteItem

class ItemsRecyclerAdapter(private val listData: ResultItem) : RecyclerView.Adapter<ViewHolder>() {

    private val drivers: Array<DriverItem> = listData.drivers!!
    private val routes: Array<RouteItem> = listData.routes!!

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem: View = layoutInflater.inflate(R.layout.result_item, parent, false)
        return RequestItemVH(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = listData.drivers?.get(position)
        val itemView = holder.itemView
        itemView.findViewById<TextView>(R.id.id).text = item?.id.toString()
        itemView.findViewById<TextView>(R.id.name).text = item?.name

        itemView.setOnClickListener(object: OnClickListener {
            override fun onClick(v: View?) {
                if(item!!.id != null) {
                    routes.firstNotNullOf {
                        when {
                            it.id == item!!.id -> {

                            }
                            (item!!.id!! % 2 == 0) -> {

                            }
                            (item!!.id!! % 5 == 0) -> {

                            }
                            else -> {

                            }
                        }
                    }
                }
                else {
                    Toast.makeText(itemView.context, "Driver Route Unavailable", Toast.LENGTH_LONG)
                }
            }
        })
    }

    override fun getItemCount(): Int {
        return drivers.size
    }
}

class RequestItemVH(itemView: View): ViewHolder(itemView)