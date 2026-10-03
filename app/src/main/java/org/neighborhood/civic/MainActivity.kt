package org.neighborhood.civic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.neighborhood.civic.core.designsystem.NeighborhoodTheme
import org.neighborhood.civic.feature.home.HomeRoute

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NeighborhoodTheme {
                HomeRoute()
            }
        }
    }
}
