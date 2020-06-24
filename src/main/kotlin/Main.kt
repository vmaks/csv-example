import com.opencsv.CSVWriter
import java.io.FileWriter

fun main() {
    val fileName = "example.csv"
    val writer = CSVWriter(FileWriter(fileName))
    val rows = listOf(
        listOf("name", "age"),
        listOf("Mark", "20"),
        listOf("Jane", "22")
    )
    writer.use {
        for (row in rows) {
            writer.writeNext(row.toTypedArray())
        }
    }
}