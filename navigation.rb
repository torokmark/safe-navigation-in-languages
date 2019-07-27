#!/usr/bin/env ruby
=begin
hsh = Hash.new
hsh['mammals'] = {
  'pata' => { 'harom ujju' => 'malac',
             'ketujju' => 'oz'}
}


p ((hsh['mammals'] || {})['pataaa'] || {})['ketujju']

Address = Struct.new(:city, :street, :number)
Person = Struct.new(:name, :age, :address)

people = []
people[0] = Person.new('jancsi', 12, Address.new('Bp', 'somewhere over the rainbow', '42'))
people[1] = Person.new('jancsi', 12)

people.each do |person|
  p person&.address&.street
end
=end

animals = Hash.new
animals['mammals'] = {'even-toed' => 'giraffe'}                                 
animals['reptiles'] = {'snakes' => { 'cobra' => ['king cobra', 'tree cobra']} }

#['mammals', 'reptiles', 'birds'].each do |key|
#  p animals[key]['snakes']
#end

p (animals['mammals'] || {})['snakes']  
p (animals['reptiles'] || {})['snakes']  
p (animals['birds'] || {})['snakes']  

p animals.dig('mammals', 'snakes')
p animals.dig('reptiles', 'snakes')
p animals.dig('birds', 'snakes')

