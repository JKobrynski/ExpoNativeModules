import ExpoModulesCore

// public class ExpoBatteryModule: Module {
public class ExpoBatteryModule: Module {
  public func definition() -> ModuleDefinition {
    Name("ExpoBattery")

    OnCreate {
      UIDevice.current.isBatteryMonitoringEnabled = true
    }

    OnDestroy {
      UIDevice.current.isBatteryMonitoringEnabled = false
    }

    Function("getBatteryLevel") { () -> Float in 
      return UIDevice.current.batteryLevel
    }
  }
}