import * as Battery from "expo-battery";
import { Text, View } from "react-native";

export default function App() {
  return (
    <View style={{ flex: 1, alignItems: "center", justifyContent: "center" }}>
      <Text>Battery level: {Battery.getBatteryLevel()}</Text>
    </View>
  );
}
