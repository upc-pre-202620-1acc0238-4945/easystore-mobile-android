package pe.edu.upc.easystore.features.auth.infrastructure.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import javax.inject.Inject

class TokenManager @Inject constructor(private val dataStore: DataStore<Preferences>) {

    companion object {
        val TOKEN = stringPreferencesKey("token")
    }

    suspend fun saveToken(token: String) {
        dataStore.edit { preferences ->
            preferences[TOKEN] = token
        }
    }
}