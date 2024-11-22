package vn.edu.hust.studentman

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val students = mutableListOf(
      StudentModel("Trần Ngọc Bảo Anh", "SV001"),
      StudentModel("Trần Bảo Anh", "SV002"),
      StudentModel("Lê Hoàng Cường", "SV003"),
      StudentModel("Phạm Dung Châu", "SV004"),
      StudentModel("Đỗ Minh Đức", "SV005"),
      StudentModel("Vũ Hoa Dung", "SV006"),
      StudentModel("Hoàng Hải Đăng", "SV007"),
      StudentModel("Bùi Hồng Hạnh", "SV008"),
      StudentModel("Đinh Hùng Cường", "SV009"),
      StudentModel("Nguyễn Linh Đan", "SV010"),
      StudentModel("Phạm Long Khánh", "SV011"),
      StudentModel("Trần Mai Trang", "SV012"),
      StudentModel("Lê Ngọc Hân", "SV013"),
      StudentModel("Vũ Nam Phong", "SV014"),
      StudentModel("Hoàng Phương Linh", "SV015"),
      StudentModel("Đỗ Quân Hùng", "SV016"),
      StudentModel("Nguyễn Thu Hà", "SV017"),
      StudentModel("Trần Tài Lộc", "SV018"),
      StudentModel("Phạm Tuyết Mai", "SV019"),
      StudentModel("Lê Vũ Hoàng", "SV020")

    )

    val studentAdapter = StudentAdapter(students)

    findViewById<RecyclerView>(R.id.recycler_view_students).run {
      adapter = studentAdapter
      layoutManager = LinearLayoutManager(this@MainActivity)
    }
  }
}