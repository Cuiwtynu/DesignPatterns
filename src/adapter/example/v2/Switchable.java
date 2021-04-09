package adapter.example.v2;

// 可开关接口
public interface Switchable {

	void turnOn();

	void turnOff();

}

// 思考：谁拥有这个接口？
// 为什么接口叫 Switchable 而不是 ILight 或者 IDoor？
// 逻辑关系：在没有 Switchable 的情况下就无法使用 Switch
// 实体关系：Light 是 Switchable 的，但没有 Light 的情况下完全可以用 Switch
// 逻辑关系强于实体关系，说明接口 Switchable 属于它的客户 Switch。
