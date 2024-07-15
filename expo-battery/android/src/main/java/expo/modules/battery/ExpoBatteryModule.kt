package expo.modules.battery

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

import android.content.Context.BATTERY_SERVICE
import android.os.BatteryManager
import android.os.BatteryManager.BATTERY_PROPERTY_CAPACITY

class ExpoBatteryModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("ExpoBattery")

    Function("getBatteryLevel") {
      val batteryManager = appContext.reactContext?.getSystemService(BATTERY_SERVICE) as BatteryManager
      return@Function batteryManager.getIntProperty(BATTERY_PROPERTY_CAPACITY).toDouble() / 100
    }
  }
}