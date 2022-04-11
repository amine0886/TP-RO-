/*********************************************
 * OPL 12.6.0.0 Model
 * Author: amine
 * Creation Date: 13 mars 2022 at 12:05:40
 *********************************************/
//declarations
{int} SOMMET ={11,1,2,3,4,5,6,7,8,9,10,12};

tuple arc { 
  key int o;
  key int d;
  float capacity;
}

	{arc} arcs with o,d in SOMMET=
{
  <11,1,35>, 
  <11,2,25>, 
  <1,3,20>,
  <1,5,15>, 
  <1,6,12>, 
  <2,5,6>, 
  <2,6,22>, 
  <3,4,15>, 
  <3,5,10>,
  <6,7,22>, 
  <5,8,10>, 
  <5,9,15>,
  <5,10,15>, 
  <4,8,7>, 
  <4,9,10>,
  <7,9,10>, 
  <7,10,10>, 
  <8,12,18>,   
  <9,12,15>, 
  <10,12,20>
 
};

dvar float+ flow[t in arcs] in 0..t.capacity;

maximize sum(e in arcs:e.o==11) flow[e];
subject to
{
  // flow conservation
  forall(n in SOMMET diff {11,12}) 
    flowConservation:
      sum(e in arcs:e.o==n) flow[e]==sum(e in arcs:e.d==n) flow[e];
}

execute
{
  for(var e in arcs)
   writeln(e.o," -> ",e.d," : ",flow[e]);
}
