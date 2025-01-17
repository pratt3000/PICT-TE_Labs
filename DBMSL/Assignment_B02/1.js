conn = new Mongo();
db = conn.getDB("A10");


db.createCollection("Aadhar");

db.Aadhar.insert({
    Aadharno : 123456,
    Name : "Prathamesh KS",
    MobileNo : 7755922895,
    Gender : "Male",
    Citizenship : "Indian",
    Age : 20,
    Address : "Pune",
    Voted : {"2020" : 1, "2019" : 0, "2018" : 0 }
});

db.Aadhar.insert({
    Aadharno : 123459,
    Name : "Sooraj VS",
    MobileNo : 7755922894,
    Gender : "Male",
    Citizenship : "Indian",
    Age : 21,
    Address : "Mumbai",
    Voted : {"2020" : 1, "2019" : 0, "2018" : 1 }
});
db.Aadhar.insert({
    Aadharno : 133455,
    Name : "Aditya Somani",
    MobileNo : 7755922893,
    Gender : "Male",
    Citizenship : "Indian",
    Age : 31,
    Address : "Mumbai",
    Voted : {"2020" : 1, "2019" : 1, "2018" : 1 }
});
db.Aadhar.insert({
    Aadharno : 125455,
    Name : "Utkarsh Gurav",
    MobileNo : 7755922892,
    Gender : "Male",
    Citizenship : "Indian",
    Age : 98,
    Address : "Nashik",
    Voted : {"2020" : 0, "2019" : 0, "2018" : 0 }
});
db.Aadhar.insert({
    Aadharno : 126451,
    Name : "Henry VS",
    MobileNo : 7755922824,
    Gender : "Male",
    Citizenship : "US",
    Age : 21,
    Address : "Mumbai",
    Voted : {"2020" : 1, "2019" : 0, "2018" : 1 }
});
db.Aadhar.insert({
    Aadharno : 123465,
    Name : "Tanvi MD",
    MobileNo : 7755922214,
    Gender : "Female",
    Citizenship : "US",
    Age : 43,
    Address : "Newyork",
    Voted : {"2020" : 1, "2019" : 0, "2018" : 0 }
});


db.Aadhar.find().pretty();
db.Aadhar.find({Address : "Pune"}).pretty();
db.Aadhar.find({Name:{$in:["Prathamesh KS","Tanvi MD"]}}).pretty();
db.Aadhar.find({$and : [{Address : "Mumbai"},{Age : 21} ] }).pretty();
db.Aadhar.find({"Voted.2018":{$lt:1}}).pretty();
db.Aadhar.find({Gender:{$all:["Female"]}}).pretty();
db.Aadhar.find({$and:[{Age:{$gt:25}},{Aadharno:{$gt:123456}}]}).pretty();

db.Aadhar.find({Name : "Prathamesh KS"}).pretty();
db.Aadhar.updateOne({Name:"Prathamesh KS"},{$set:{Age:21}});
db.Aadhar.find({Name : "Prathamesh KS"}).pretty();

db.Aadhar.update(
    {
        Aadharno : 123459,
        Name : "Ram VS",
        MobileNo : 7755922894,
        Gender : "Male",
        Citizenship : "Indian",
        Address : "Pune",
        Voted : {"2020" : 1, "2019" : 1, "2018" : 1 }
    },
    {$set:{Age:23}},
    {upsert:true}
);

db.Aadhar.find().pretty();

db.Aadhar.deleteMany({"Voted.2018":0});
db.Aadhar.find().pretty();

db.Aadhar.remove({"Voted.2018":1},{justOne:true});
db.Aadhar.find().pretty();
db.dropDatabase();
