import ExpoBatteryModule from "./ExpoBatteryModule";

export function getBatteryLevel(): number {
  return ExpoBatteryModule.getBatteryLevel();
}
