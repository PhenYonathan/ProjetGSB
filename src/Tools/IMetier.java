/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Dosage;
import Entity.Famille;
import Entity.Interragis;
import Entity.Medicament;
import Entity.Prescrire;
import Entity.TypeIndividu;
import Entity.Utilisateur;
import java.util.ArrayList;
import java.util.HashMap;

public interface IMetier 
{
    public ArrayList<Medicament> GetAllMedicament();
    public ArrayList<Medicament> GetMedicamentBySearch(String nomMedic);
    public Utilisateur VerifierIdentifiants(String login, String mdp);
    public ArrayList<TypeIndividu> GetAllTypeIndividu();
    public ArrayList<Famille> GetAllFamille();
    public Medicament AddMedicament(String nomMedicament, String famCode, String medComposition, String medEffets, String medContreIndic, float prix);
    public Prescrire addAjoutPres(String medDepotLegal, String tinCode, String dosCode, String prePosologie);
    public Medicament GetUnMedic(int idMedic);
    public Medicament GetNomMedic(String nomMedic);
    public Medicament SetModifMedic(int medId, String nomMedicament, String famCode, String medComposition, String medEffets, String medContreIndic, float prix);
    public ArrayList<Dosage> GetAllDosage();
    public boolean checkLimitText(String text);
    public boolean isNumeric(String str);
    public Prescrire getPrescription(String nomMedoc, String nomType, String dosCode);
    public Medicament deleteMedic(int idMedic);
    public TypeIndividu addTypeIndividu(String nomIndividu);
    public TypeIndividu GetNomTypeModif(int nomType);
    public TypeIndividu GetNomType(String nomType);
    public TypeIndividu SetModifType(int idType, String nomType);
    public Interragis addInterraction(int medPerturbateur, int medPerturbe);
    public int getNextId();
    public ArrayList<Medicament> getAllInterraction(int leMedic);
    public ArrayList<Medicament> getLesInterraction (int leMedic);
    public Interragis verifierInterraction(int medPerturbateur, int medPerturbe);
    public HashMap<String,Integer> GetDatasPieChart();
    public HashMap<String,Integer> GetDatasBarChart();
    public ArrayList<Medicament> GetPlusPrescrit();
    public ArrayList<Medicament> GetMoinsPrescrit();
    public Utilisateur addutilisateur(String login, String mdp);
    public ArrayList<Utilisateur> getAllUtilisateur();
    public Utilisateur DeleteUser(int idUser);
}