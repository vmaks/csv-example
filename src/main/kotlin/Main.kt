import com.opencsv.CSVWriter
import java.io.FileWriter

fun main() {
    val fileName = "example.csv"
    val writer = CSVWriter(FileWriter(fileName))
    val stringArray = listOf(
        listOf("name", "age"),
        listOf("Mark", "20"),
        listOf("Jane", "22")
    )
    writer.use {
        for (array in stringArray) {
            writer.writeNext(array.toTypedArray())
        }
    }
}