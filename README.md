Exo3
Le ratio d’endettement (ou taux d'endettement), exprimé en pourcentage, il est un bon indicateur de l’état de vos finances, plus particulièrement de votre utilisation du crédit. Plus il est bas, meilleure sera votre capacité à faire face aux imprévus et à maîtriser votre niveau d’endettement.
 
Au contraire, un ratio de dettes élevé témoigne d’une situation précaire et fragile susceptible de se détériorer rapidement advenant un changement inattendu.
 
Pour aider les étudiants a contrôler leurs ratio d'endetement, vous devez réaliser une application leurs permettant de:
 
1-Fournir leurs sources de revenus
2-Fournir leurs charges
3-Modifier une charge/revenu
4-Effacer une charge/revenu
5-Calculer le revenu total
6-Calculer les charges total
7-Calculer et afficher le taux d'endettement
8-Calculer et afficher la capacité d'emprunt
 
Créez la classe Finance, Entree  en y incluant tous les données et fonctions membres nécessaires au bon fonctionnement de votre application.
 
La classe Entrée devra contenir les attributs:
 
1-id:int
2- types:bool (revenus ou charges)
3- montant:double
4- un constructeur
5- des get/set
 
La classe Finance devra contenir les attributs et les fonctions :
 
1-nom:String
2-mesRevenus:ArrayList<Entree>
3-mesCharges:Arraylist<Entree>
4-un constructeur recevant le nom de l'étudiant en paramètre
5-la fonction addRevenu(r:Entree)
6-la fonction addCharge(c:Entree)
7-la fonction modifierRevenu(id:int,val:double)
8-la fonction modifierCharge(id:int,val:double)
9-la fonction effacerRevenu(id:int)
10-la fonction effacerCharge(id:int)
11- la fonction calculRevenuTotal():double
12- la fonction calculChargeTotal():double
13- la fonction calculTauxEndettement():double
14-la fonction calculCapaciteEmprunt():double
 
Votre application sera composée de deux activités. La première activité permettra à l'utilisateur d'effectuer les opérations suivantes :
 
1-Fournir leurs sources de revenus
2-Fournir leurs charges
3-Modifier une charge/revenu
4-Effacer une charge/revenu
 
La seconde activité vous permettra quand à elle
d'effectuer les opérations suivantes:
 
5-Calculer le revenu total
6-Calculer les charges total
7-Calculer et afficher le taux d'endettement 8-Calculer et afficher la capacité d'emprunt
 

 
