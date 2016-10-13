class Farm 
{     
   private Animal [] manyAnimals = new Animal[3];
   public Farm()
   {
   	manyAnimals[0] = new NamedCow("cow","moo", "Jonathan");
   	manyAnimals[1] = new Chick("chick","cheep", "cluck");
   	manyAnimals[2] = new Pig("pig","oink");
   }
   public void animalSounds()
   {
   	for(int i = 0; i < manyAnimals.length; i++)
   	{
   		System.out.println(manyAnimals[i].getType() + " goes " + manyAnimals[i].getSound());
   	}
   	System.out.println("This cow's name is " + ((NamedCow)manyAnimals[0]).getName());
   }
}
