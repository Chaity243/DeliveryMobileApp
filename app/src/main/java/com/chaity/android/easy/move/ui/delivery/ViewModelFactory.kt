

package com.chaity.android.easy.move.ui.delivery

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.chaity.android.easy.move.data.DeliveryRepository
import javax.inject.Inject

/**
 * Factory for ViewModels
 */
class ViewModelFactory @Inject constructor(private val repository: DeliveryRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DeliveriesViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return DeliveriesViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
