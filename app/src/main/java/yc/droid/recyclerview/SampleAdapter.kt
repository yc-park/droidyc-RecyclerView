package yc.droid.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleAdapter(private val dataSet: List<Sample>) : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {
  // ViewHolder를 새로 만들어야할 때 호출
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    // ViewHolder와 그에 연결된 View를 생성하고 초기화하지만 뷰의 콘텐츠를 채우지는 않는다.
    val view = LayoutInflater.from(parent.context).inflate(R.layout.sample_item, parent, false)
    return ViewHolder(view)
  }

  // ViewHolder를 데이터와 연결할때 호출
  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.textView.text = dataSet[position].title
    holder.button.text = dataSet[position].buttonText
  }

  // 데이터 셋 크기를 가져올 때 호출
  override fun getItemCount(): Int {
    return dataSet.size
  }

  class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.textView)
    val button: Button = view.findViewById(R.id.button)
  }
}