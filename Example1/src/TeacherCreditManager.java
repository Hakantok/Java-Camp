
public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
    public void calculate() {
        System.out.println("��retmen kredisi hesapland�");
    }

    @Override
    public void save() {
        System.out.println("��retmen kredisi kaydedildi");
    }
}
