class MedicalStore1Tester{
public static void main(String test[]){
MedicalStore1.addMedicines("Ivermectin");
MedicalStore1.addMedicines("Paracetamol");
MedicalStore1.addMedicines("Dolo");
MedicalStore1.addMedicines("Voltaren");
MedicalStore1.addMedicines("Benylin");
MedicalStore1.addMedicines("Citrem");
MedicalStore1.addMedicines("Panadol");
MedicalStore1.addMedicines("Aleve");
MedicalStore1.addMedicines("Ecotrin");
MedicalStore1.addMedicines("Tylenol");
MedicalStore1.getAllMedicineNames();

boolean isUpdated = MedicalStore1.updateMedicineNames("Dolo", "Dolo 650");
System.out.println("Is medicine name updated" +isUpdated);
MedicalStore1.getAllMedicineNames();

int newLength = MedicalStore1.deleteMedicine("Panadol");
System.out.println("Calling all medicineNames");

MedicalStore1.getAllMedicineNamesPostDeletion(newLength);
}
}

