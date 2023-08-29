import React from "react";
import "../css/home.css"
import img from "../images/19.png";

function About() {
  return (
    <div
      class="min-vh-100 pt-5 text-white"
      style={{
        backgroundImage:
          "linear-gradient(to right top, #051937, #004d7a, #008793, #00bf72, #a8eb12)",
      }}
    >
      <h1 class="mt-5 pt-5 text-center  display-2 fw-bold">Zero-Waste</h1>
      <div class="container-fluid p-5 ">
        <div class="row m-auto">
          <div class="col-lg-8">
            <h1>
              <b>ABOUT US</b>
            </h1>
            <br />
            <h1>
              <strong>Welcome to Siddhivinayak Marriage Bureau</strong>
            </h1>
            <h4>
            <p>Siddhivinayak Marriage Bureau Is A Leading Matrimonial Services
                        and Matchmaking Services Company That Sets Out To Re-Define
                        Matrimony In India. Our Personalized Services Will Bring Back The
                        Old-Fashioned Way Of Personalized Matchmaking That Will Be
                        Purely Based On Compatibility, In A One –On-One Setting.
                        We Have A Very Stringent And Personalized Screening Process To
                        Hand–Pick Our Clients, Based On Criteria Such As Family
                        Background, Academic And Professional Qualifications, Education,
                        Interests, Matrimonial profile And Much More for Indian Wedding.
                        Siddhivinayak Marriage Bureau Is A Place For Educated, Classy And
                        Like-Minded Individuals In Terms Of Clients As Well As Employee.
                    </p>
            </h4>
            <br />
          </div>
          <div class="col-lg-4 mt-5">
            <img
              src={img}
              class="card img-fluid"
              style={{ width: "415.99px", height: "250px" }}
            />
          </div>
        </div>
      </div>
      <div class="container-fluid p-5">
        <div class="row">
          <div class="col-lg-6">
            <div className="font text-center">
              <i className="fas fa-recycle fa-9x " />
            </div>
            <br />
            <div className=" text-center m-auto">
              <div className="row ">
                <h2>
                  <i className=" fas fa-circle "> Reduce</i>
                  <i className=" fas fa-circle "> Reuse </i>
                  <i className=" fas fa-circle "> Recycle</i>
                </h2>
              </div>
            </div>
          </div>
          <div class="col-lg-6">
            <h1>
              <strong>Our Vision</strong>
            </h1>
            <br />
            <h4>
              <p>Inclusive, Sustainable and Equitable Growth For All</p>
            </h4>
            <h4>
              <p>
                We bring together nature, people and technology to provide the
                most impactful waste management solutions that maximise resource
                recovery
              </p>
            </h4>
          </div>
        </div>
      </div>
    </div>
  );
}

export default About;
