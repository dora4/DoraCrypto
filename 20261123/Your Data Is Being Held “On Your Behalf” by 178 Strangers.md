# Your Data Is Being Held “On Your Behalf” by 178 Strangers

## — How Long Is Your Digital Delegation Chain, As Seen in the Optimizely Incident

On November 16, an incident sent shockwaves through the cybersecurity community.

Report URI, a security research organization, disclosed that websites belonging to 178 organizations worldwide had fallen victim to a supply-chain attack. The list includes names you visit every day: BBC, CNN, Zoom, HSBC, IKEA, Salesforce, GitLab, Bloomberg, Fox News, Alaska Airlines, and many more.

Attackers exploited a vulnerability in Optimizely, a web optimization platform, to inject malicious JavaScript onto these sites. When visitors loaded a legitimate BBC news page, hidden malicious scripts ran in the background, stealing crypto wallet addresses, bank card details and browser cookies.

178 organizations in total. 1,611 scripts were inspected, and 188 were compromised. Within a single day, attackers modified their malicious payload 26 times, adding more capabilities with each revision.

Today, however, I won’t dwell on how unlucky these 178 websites were. I want to talk about something much closer to home:
**How many “Optimizelys” have handled your data?**

---

## You Have a Digital Delegation Chain — You Just Don’t Know It

What is Optimizely? Simply put, it is a tool for websites to run A/B tests and personalized content. Businesses embed Optimizely on their sites to test which page versions drive better conversion rates. Tens of thousands of companies around the world rely on it, spanning retail, finance, tech and media.

It is not part of the website itself. It is an underlying tool — a third-party service.

When you open the BBC website, you may think you are interacting directly with the BBC. In reality, your browser also connects to Optimizely’s CDN servers, loading and executing its code. Between you and the BBC sits Optimizely.

This is the idea of the **digital delegation chain**: you believe you are dealing with Party A, but A outsources work to B, B to C, and C to D. Your data passes along this chain, yet you only know A.

A business’s digital delegation chain often looks like this: Website → CDN provider → A/B testing tool → analytics platform → ad network → customer support system → CRM → email service → payment gateway…

### What about your personal digital delegation chain?

Your photos live in cloud storage → the cloud runs on AWS data centers → AI features call third-party model APIs → backups are replicated across multiple geographic regions → sync traffic passes through many intermediate nodes.

Your chat history stays inside a messaging app → messages route through backend servers → images get compressed for storage → search functions are powered by external engines → push notifications travel over separate channels.

Can you count how many third parties touch your files? Can you list every service provider your data has been delegated to?

You cannot. But you granted permission.

---

## The Lesson from 178 Organizations: A Chain Is Only as Strong as Its Weakest Link

A critical detail of the Optimizely breach: the 178 websites themselves were not hacked.

Is BBC’s server secure? Yes. Does HSBC have robust firewalls? Absolutely. Is Zoom’s encryption solid? It is. Still, some of their data was stolen, because Optimizely — their vendor — was compromised.

Cybersecurity researcher Scott Helme put it chillingly:
**At the time, the attackers held enough access to publish fake news on the BBC site, or steal sensitive information from HSBC and Zoom’s web pages. Worse outcomes only did not happen because the attackers chose not to carry them out.**

This was not a breached defensive perimeter. The perimeter was never there to begin with.

Where is your line of defense?

You store photos on a cloud drive, and the provider says it uses industry-leading encryption. But as your files sync between devices, how many intermediate hops do they cross? Who manages encryption at those hops?

You upload scanned contracts to cloud storage, and the platform claims it has passed Level-3 Cybersecurity Classified Protection certification. But when your files are indexed for full-text search, are they sent to an external search service? Does that service uphold the same data protections?

**Your data security does not depend on how well you protect things yourself. It depends on the weakest link along your entire delegation chain.**

And most of the time, you have no idea how long that chain is.

---

## A Separate Incident Around the Same Time Makes the Point Clear

Three days after the Optimizely breach, on November 19, JPMorgan Chase, Visa and Mastercard all disclosed nearly simultaneously that one of their third-party vendors had suffered a cyberattack.

A ransomware group known as “n0n” claimed to have obtained customer marketing interaction records. A Reuters review found files linked to JPMorgan contained over 16,000 email addresses; Visa’s affected data covered thousands of client emails across Asia-Pacific markets including Singapore, Hong Kong, Japan and South Korea.

JPMorgan released a standard statement: “Our services remain uninterrupted. This incident concerns certain marketing data held by a third-party vendor.” Visa said its own internal systems were unaffected. Mastercard confirmed its payment network was not compromised.

All of them said the same thing:
**We were not hacked. Our vendor was.**

TSMC said exactly that on November 12. MUFG Bank said it on November 18. Infoblox said it on November 17.

“Not us. Our vendor.”

This phrase is becoming the standard script for data breach disclosures in 2026.

---

## Individual Users Face Riskier Delegation Chains Than Businesses

Companies at least have IT teams, security budgets, binding vendor contracts, cybersecurity certifications, penetration testing and incident response teams.

What do you have?

A cloud account. A password. A checked box reading “I have read and agree to the terms of service.”

How many third-party vendors does your cloud storage provider rely on? Who runs its CDN? Whose APIs power its AI tools? In which country’s data centers are backups stored? Was its search function built in-house or outsourced?

You do not know, and you have no straightforward way to find out.

Business chains can be traced through contracts. Your personal delegation chain is a black box: you upload your files, and hope they stay safe.

**That is not a security strategy. That is gambling.**

---

## The Root Cause: Your Data Has Left Your Control

Every supply-chain compromise and third-party leak boils down to one fundamental problem:
**Your data is no longer under your control.**

Once your files sit on someone else’s servers, you surrender partial control. You cannot track how many copies are made, how many times they are transmitted, or which systems read them. The longer your delegation chain, the thinner your control becomes.

DoraCloud was built around this core problem.

It is not “just another cloud drive.” It is a tool designed to shorten your delegation chain.

**Store ordinary files normally.**
Travel photos, work documents, study materials — files that do not require maximum security — can be stored and synced for convenience: fast, accessible across all your devices.

**Store sensitive files in isolation.**
ID photos, scanned contracts, bank statements, medical reports — files that would cause real harm if leaked — live in a separate, encrypted space where only you hold the encryption keys.

Why separate them? Most data breaches do not happen because someone targets your files specifically. They happen because your files drift along an invisible delegation chain. When one link fails, your private documents get swept up alongside casual snapshots.

**Separating sensitive files from everyday files creates a break point in your delegation chain.**
Even if one link is compromised, attackers only get your vacation photos — not your government ID.

---

## Three Practical Steps You Can Take

While delegation chains cannot be eliminated entirely, you can reduce risk with three actions:

**First, shorten your chain.**
Do not upload files to the cloud unless necessary. Process files locally whenever possible. Every link you remove removes a potential leak point.

**Second, classify your data.**
Not all files need the same level of protection. A travel photo and an ID scan have vastly different security requirements. Mixing them forces an impossible tradeoff: either encrypt everything (which is cumbersome and unsustainable) or encrypt nothing (leaving you exposed). Classification lets you apply stronger safeguards only where they matter.

**Third, hold your own keys.**
If your encrypted cloud files have keys held by the service provider, encryption loses much of its value. If the provider controls the keys, attackers who take over your account can decrypt your data. When you hold the keys, protection is mathematical — not merely a provider’s promise.

The Optimizely incident shows that every third party you trust can become an attack vector.

178 of the world’s largest organizations were compromised on the same day through a single vendor vulnerability.

You may not rely on 178 vendors, but you do rely on several. Do you know who they are? Can you control them?

If you cannot, at minimum — **keep your sensitive private files off that uncontrollable chain.**

DoraCloud: Put your data back in your hands.

---

*Written November 23, 2026. All cited security incidents are based on public reports.*