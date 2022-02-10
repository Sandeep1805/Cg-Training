//ATLANTA POPULATION

db.zipcodes.find({$and:[{city:'ATLANTA'},{state:'GA'}]})
db.zipcodes.aggregate([{$match:{city:'ATLANTA',state:'GA'}}])
db.zipcodes.aggregate([{$match:{city:'ATLANTA'}},{$group:{_id:{_id:'$_id'}}},{$count:'Number of zip code'}])
db.zipcodes.aggregate([{$group:{_id:'$city',population:{$sum:'$pop'}}},{$match:{_id:'ATLANTA'}}])

//POPULATIONS BY STATE
db.zipcodes.aggregate([{$group:{_id:'$state',population:{$sum:'$pop'}}}])
db.zipcodes.aggregate([{$group:{_id:'$state',population:{$sum:'$pop'}}},{$sort:{population: -1}}])
db.zipcodes.aggregate([{$group:{_id:'$state',population:{$sum:'$pop'}}},{$sort:{population: -1}},{$limit:3}])

//POPULATIONS BY CITY
db.zipcodes.aggregate([{$group:{_id:{city:"$city",state:"$state"},population:{$sum:"$pop"}}},{$sort:{"population":-1}},{$limit: 3}])
{ _id: { city: 'CHICAGO', state: 'IL' }, population: 2452177 },
  { _id: { city: 'BROOKLYN', state: 'NY' }, population: 2300504 },
  { _id: { city: 'LOS ANGELES', state: 'CA' }, population: 2102295 }



//BONUS
db.zipcodes.aggregate([{$group:{_id:{state:'$state'},avgcitypopulation:{$avg:'$pop'}}},{$sort:{'avgcitypopulation':-1}},{$limit:3}])
{ _id: { state: 'DC' }, avgcitypopulation: 25287.5 },
{ _id: { state: 'CA' }, avgcitypopulation: 19627.236147757256 },
{ _id: { state: 'FL' }, avgcitypopulation: 15779.407960199005 }