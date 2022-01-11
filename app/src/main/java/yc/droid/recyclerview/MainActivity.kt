package yc.droid.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
  private val recyclerView: RecyclerView by lazy {
    findViewById(R.id.sampleRecyclerView)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // 레이아웃 매니저 적용
    recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    // 어댑터 적용
    recyclerView.adapter = SampleAdapter(createSampleArrayList())
  }

  private fun createSampleArrayList() = arrayListOf(
    Sample("title0", "button0"),
    Sample("title1", "button1"),
    Sample("title2", "button2"),
    Sample("title3", "button3"),
    Sample("title4", "button4"),
    Sample("title5", "button5"),
    Sample("title6", "button6"),
    Sample("title7", "button7"),
    Sample("title8", "button8"),
    Sample("title9", "button9")
  )
}