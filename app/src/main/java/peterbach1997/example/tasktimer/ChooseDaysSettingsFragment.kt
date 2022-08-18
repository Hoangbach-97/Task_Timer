package peterbach1997.example.tasktimer

import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.preference.PreferenceFragmentCompat

class ChooseDaysSettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }

    override fun toString(): String {
        return super<PreferenceFragmentCompat>.toString()
        TODO("test")
    }

    override fun getLifecycle(): Lifecycle {
        return super.getLifecycle()
        TODO("TEST")
    }
}