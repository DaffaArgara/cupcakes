package id.dafaargara.cupcakes.ui.theme

import androidx.compose.runtime.Composable
import id.dafaargara.cupcakes.R

@Composable
fun CupcakeApp() {
    // Isi dengan composable yang sesuai untuk aplikasi Cupcake kamu
    // Misalnya, memanggil screen utama atau navigasi
    StartOrderScreen(
        quantityOptions = listOf(
            Pair(R.string.one_cupcake, 1),
            Pair(R.string.six_cupcakes, 6),
            Pair(R.string.twelve_cupcakes, 12)
        ),
        onNextButtonClicked = { /* Handle klik */ }
    )
}
