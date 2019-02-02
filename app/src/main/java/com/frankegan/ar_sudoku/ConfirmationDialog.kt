package com.frankegan.ar_sudoku

import android.Manifest
import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment


/**
 * Shows OK/Cancel confirmation dialog about camera permission.
 */
class ConfirmationDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            AlertDialog.Builder(requireContext())
                    .setMessage(R.string.request_permission)
                    .setPositiveButton(android.R.string.ok) { _, _ ->
                        parentFragment?.requestPermissions(arrayOf(Manifest.permission.CAMERA),
                                REQUEST_CAMERA_PERMISSION)
                    }
                    .setNegativeButton(android.R.string.cancel) { _, _ ->
                        parentFragment?.activity?.finish()
                    }
                    .create()
}